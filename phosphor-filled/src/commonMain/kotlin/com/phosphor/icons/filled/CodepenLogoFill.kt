package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CodepenLogoFill: ImageVector
    get() {
        if (_CodepenLogoFill != null) {
            return _CodepenLogoFill!!
        }
        _CodepenLogoFill = ImageVector.Builder(
            name = "Filled.CodepenLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.79f, 89f)
                lineToRelative(-104f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.58f, 0f)
                lineToRelative(-104f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 96f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.21f, 7f)
                lineTo(114.1f, 217.6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.9f, -3.52f)
                verticalLineToRelative(-57.3f)
                lineTo(66.55f, 128f)
                lineTo(32f, 146.61f)
                lineTo(32f, 109.39f)
                lineTo(66.55f, 128f)
                lineToRelative(16.88f, -9.09f)
                lineTo(40.87f, 96f)
                lineTo(120f, 53.39f)
                lineTo(120f, 99.22f)
                lineTo(83.43f, 118.91f)
                lineToRelative(44.57f, 24f)
                lineToRelative(44.57f, -24f)
                lineTo(189.45f, 128f)
                lineTo(224f, 109.39f)
                verticalLineToRelative(37.22f)
                lineTo(189.45f, 128f)
                lineTo(136f, 156.78f)
                verticalLineToRelative(57.3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.9f, 3.52f)
                lineTo(235.79f, 167f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.21f, -7f)
                lineTo(240f, 96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 235.79f, 89f)
                close()
                moveTo(172.57f, 119f)
                lineTo(136f, 99.22f)
                lineTo(136f, 53.39f)
                lineTo(215.13f, 96f)
                close()
            }
        }.build()

        return _CodepenLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _CodepenLogoFill: ImageVector? = null
