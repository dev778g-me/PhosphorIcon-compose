package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShieldSlashFill: ImageVector
    get() {
        if (_ShieldSlashFill != null) {
            return _ShieldSlashFill!!
        }
        _ShieldSlashFill = ImageVector.Builder(
            name = "Filled.ShieldSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 25.24f, -5.85f, 45.72f, -14.3f, 62.14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.53f, 0.87f)
                lineTo(86.52f, 46.69f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -6.69f)
                horizontalLineTo(208f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 56f)
                close()
                moveTo(53.92f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.26f, 42f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f)
                curveToRelative(23.06f, 18.86f, 46f, 25.27f, 47f, 25.53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 0f)
                curveToRelative(1f, -0.26f, 23.91f, -6.67f, 47f, -25.53f)
                arcTo(131.92f, 131.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.18f, 205f)
                lineToRelative(14.9f, 16.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.84f, -10.76f)
                close()
            }
        }.build()

        return _ShieldSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSlashFill: ImageVector? = null
