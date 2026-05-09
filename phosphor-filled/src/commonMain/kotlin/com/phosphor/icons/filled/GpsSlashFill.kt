package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GpsSlashFill: ImageVector
    get() {
        if (_GpsSlashFill != null) {
            return _GpsSlashFill!!
        }
        _GpsSlashFill = ImageVector.Builder(
            name = "Filled.GpsSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 136f)
                horizontalLineTo(215.63f)
                arcToRelative(87.21f, 87.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.13f, 33.61f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, 0.81f)
                lineTo(92.51f, 53.28f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, -6.38f)
                arcTo(87f, 87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 40.37f)
                verticalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, -8f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 16.27f)
                verticalLineToRelative(24.1f)
                arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.63f, 120f)
                horizontalLineToRelative(24.1f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 7.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 136f)
                close()
                moveTo(53.92f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42.08f, 45.38f)
                lineToRelative(21.09f, 23.2f)
                arcTo(87.63f, 87.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.37f, 120f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineTo(40.37f)
                arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 215.63f)
                verticalLineTo(240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(215.63f)
                arcToRelative(87.51f, 87.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45f, -17.43f)
                lineToRelative(21.08f, 23.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.84f, -10.76f)
                close()
            }
        }.build()

        return _GpsSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _GpsSlashFill: ImageVector? = null
