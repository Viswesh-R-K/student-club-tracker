import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import authService from '../services/authService';

const RegisterPage = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [email, setEmail] = useState('');
    const [role, setRole] = useState('STUDENT');
    const navigate = useNavigate();

    const handleRegister = async (e) => {
        e.preventDefault();
        try {
            await authService.register({ username, password, email, role });
            navigate('/login');
        } catch (error) {
            console.error('Registration failed', error);
        }
    };

    return (
        <div className="flex items-center justify-center h-screen">
            <form onSubmit={handleRegister} className="p-8 bg-white rounded shadow-md">
                <h2 className="mb-4 text-2xl">Register</h2>
                <div className="mb-4">
                    <label className="block mb-2">Username</label>
                    <input
                        type="text"
                        value={username}
                        onChange={(e) => setUsername(e.target.value)}
                        className="w-full px-3 py-2 border rounded"
                    />
                </div>
                <div className="mb-4">
                    <label className="block mb-2">Password</label>
                    <input
                        type="password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                        className="w-full px-3 py-2 border rounded"
                    />
                </div>
                <div className="mb-4">
                    <label className="block mb-2">Email</label>
                    <input
                        type="email"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                        className="w-full px-3 py-2 border rounded"
                    />
                </div>
                <div className="mb-4">
                    <label className="block mb-2">Role</label>
                    <select value={role} onChange={(e) => setRole(e.target.value)} className="w-full px-3 py-2 border rounded">
                        <option value="STUDENT">Student</option>
                        <option value="CLUB_COORDINATOR">Club Coordinator</option>
                        <option value="ADMIN">Admin</option>
                    </select>
                </div>
                <button type="submit" className="w-full px-3 py-2 text-white bg-blue-500 rounded">
                    Register
                </button>
            </form>
        </div>
    );
};

export default RegisterPage;
