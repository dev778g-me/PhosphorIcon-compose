package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CameraSlashFill: ImageVector
    get() {
        if (_CameraSlashFill != null) {
            return _CameraSlashFill!!
        }
        _CameraSlashFill = ImageVector.Builder(
            name = "Filled.CameraSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 80f)
                verticalLineTo(192f)
                arcToRelative(24.52f, 24.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, 4.65f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.9f, 2f)
                lineTo(86f, 46.08f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.37f, -4.91f)
                lineToRelative(3.74f, -5.61f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 32f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.66f, 3.56f)
                lineTo(180.28f, 56f)
                horizontalLineTo(208f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 80f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineTo(197.19f, 216f)
                horizontalLineTo(48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                verticalLineTo(80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 56f)
                horizontalLineToRelative(3.73f)
                lineTo(42.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.92f, 34.62f)
                close()
                moveTo(148f, 161.92f)
                lineToRelative(-47.88f, -52.68f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 148f, 161.92f)
                close()
            }
        }.build()

        return _CameraSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _CameraSlashFill: ImageVector? = null
