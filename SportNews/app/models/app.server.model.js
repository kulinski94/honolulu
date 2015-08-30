'use strict';

/**
 * Module dependencies.
 */
var mongoose = require('mongoose'),
	Schema = mongoose.Schema;

/**
 * App Schema
 */
var AppSchema = new Schema({
	name: {
		type: String,
		default: '',
		required: 'Please fill App name',
		trim: true
	},
	port: {
		type: Number,
		default: '',
		required: 'Please fill App port',
		trim: true
	},
	statusUri: {
		type: String,
		default: '',
		required: 'Please fill App status URI',
		trim: true
	},
	created: {
		type: Date,
		default: Date.now
	},
	user: {
		type: Schema.ObjectId,
		ref: 'User'
	}
});

mongoose.model('App', AppSchema);
