package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CameraFill: ImageVector
    get() {
        if (_CameraFill != null) {
            return _CameraFill!!
        }
        _CameraFill = ImageVector.Builder(
            name = "Filled.CameraFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 56f)
                lineTo(180.28f, 56f)
                lineTo(166.65f, 35.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 32f)
                lineTo(96f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.65f, 3.56f)
                lineTo(75.71f, 56f)
                lineTo(48f, 56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80f)
                lineTo(24f, 192f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                lineTo(208f, 216f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                lineTo(232f, 80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 56f)
                close()
                moveTo(164f, 132f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -36f, -36f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 132f)
                close()
            }
        }.build()

        return _CameraFill!!
    }

@Suppress("ObjectPropertyName")
private var _CameraFill: ImageVector? = null
