package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MicrosoftPowerpointLogoFill: ImageVector
    get() {
        if (_MicrosoftPowerpointLogoFill != null) {
            return _MicrosoftPowerpointLogoFill!!
        }
        _MicrosoftPowerpointLogoFill = ImageVector.Builder(
            name = "Filled.MicrosoftPowerpointLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 24f)
                arcTo(104.33f, 104.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54f, 64f)
                lineTo(40f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(54f, 192f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 136f, 24f)
                close()
                moveTo(72f, 152f)
                lineTo(72f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                lineTo(96f, 96f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                lineTo(88f, 144f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(128f, 215.63f)
                arcTo(88.36f, 88.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 75.63f, 192f)
                lineTo(128f, 192f)
                close()
                moveTo(128f, 64f)
                lineTo(75.63f, 64f)
                arcTo(88.36f, 88.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40.37f)
                close()
                moveTo(144f, 40.37f)
                arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.63f, 120f)
                lineTo(160f, 120f)
                lineTo(160f, 80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                close()
                moveTo(144f, 215.63f)
                lineTo(144f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(160f, 136f)
                horizontalLineToRelative(63.63f)
                arcTo(88.13f, 88.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 215.63f)
                close()
                moveTo(96f, 128f)
                lineTo(88f, 128f)
                lineTo(88f, 112f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _MicrosoftPowerpointLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftPowerpointLogoFill: ImageVector? = null
