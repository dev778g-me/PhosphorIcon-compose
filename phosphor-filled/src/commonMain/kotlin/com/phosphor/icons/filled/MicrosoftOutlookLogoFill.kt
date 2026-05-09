package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MicrosoftOutlookLogoFill: ImageVector
    get() {
        if (_MicrosoftOutlookLogoFill != null) {
            return _MicrosoftOutlookLogoFill!!
        }
        _MicrosoftOutlookLogoFill = ImageVector.Builder(
            name = "Filled.MicrosoftOutlookLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 144f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 144f)
                close()
                moveTo(232f, 112f)
                verticalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(88f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(72f, 192f)
                lineTo(40f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 64f)
                lineTo(96f, 64f)
                lineTo(96f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 112f)
                close()
                moveTo(112f, 64f)
                horizontalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(74.13f)
                lineToRelative(40f, -28.89f)
                lineTo(192f, 48f)
                lineTo(112f, 48f)
                close()
                moveTo(88f, 160f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, -32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 160f)
                close()
                moveTo(199.26f, 208f)
                lineTo(152f, 173.87f)
                lineTo(152f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(88f, 192f)
                verticalLineToRelative(16f)
                close()
                moveTo(216f, 127.65f)
                lineTo(165.66f, 164f)
                lineTo(216f, 200.35f)
                close()
            }
        }.build()

        return _MicrosoftOutlookLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftOutlookLogoFill: ImageVector? = null
