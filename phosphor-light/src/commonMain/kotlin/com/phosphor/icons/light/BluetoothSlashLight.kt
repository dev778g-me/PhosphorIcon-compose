package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.BluetoothSlashLight: ImageVector
    get() {
        if (_BluetoothSlashLight != null) {
            return _BluetoothSlashLight!!
        }
        _BluetoothSlashLight = ImageVector.Builder(
            name = "Light.BluetoothSlashLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 176f)
                lineTo(128f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 40f)
                lineTo(216f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 71.63f)
                lineToRelative(0f, -39.63f)
                lineToRelative(64f, 48f)
                lineToRelative(-33.53f, 25.15f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184.65f, 181.51f)
                lineToRelative(-56.65f, 42.49f)
                lineToRelative(0f, -96f)
                lineToRelative(25.14f, 18.86f)
            }
        }.build()

        return _BluetoothSlashLight!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothSlashLight: ImageVector? = null
