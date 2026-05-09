package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CodaLogoFill: ImageVector
    get() {
        if (_CodaLogoFill != null) {
            return _CodaLogoFill!!
        }
        _CodaLogoFill = ImageVector.Builder(
            name = "Filled.CodaLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 128f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(0.32f)
                curveToRelative(7.83f, 0.3f, 14f, -1.46f, 21.24f, -6.11f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 172f)
                verticalLineToRelative(36f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 32f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineTo(84f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.47f, 10.1f)
                arcTo(40.23f, 40.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 128f)
                close()
            }
        }.build()

        return _CodaLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _CodaLogoFill: ImageVector? = null
