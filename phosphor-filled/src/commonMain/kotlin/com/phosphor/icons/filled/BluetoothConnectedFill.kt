package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BluetoothConnectedFill: ImageVector
    get() {
        if (_BluetoothConnectedFill != null) {
            return _BluetoothConnectedFill!!
        }
        _BluetoothConnectedFill = ImageVector.Builder(
            name = "Filled.BluetoothConnectedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.2f, 6.4f)
                lineToRelative(-64f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(120f, 144f)
                lineTo(68.8f, 182.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.6f, -12.8f)
                lineTo(114.67f, 128f)
                lineTo(59.2f, 86.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, -12.8f)
                lineTo(120f, 112f)
                lineTo(120f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.8f, -6.4f)
                lineToRelative(64f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12.8f)
                lineTo(141.33f, 128f)
                lineToRelative(55.47f, 41.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 176f)
                close()
                moveTo(72f, 128f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 128f)
                close()
                moveTo(204f, 116f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 204f, 116f)
                close()
            }
        }.build()

        return _BluetoothConnectedFill!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothConnectedFill: ImageVector? = null
