package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AmazonLogoFill: ImageVector
    get() {
        if (_AmazonLogoFill != null) {
            return _AmazonLogoFill!!
        }
        _AmazonLogoFill = ImageVector.Builder(
            name = "Filled.AmazonLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 136f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 136f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(152f, 104f)
                verticalLineToRelative(0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 64f)
                verticalLineToRelative(0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(168f, 104f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 94.13f, 82.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.54f, 8.52f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 104f)
                close()
                moveTo(196.81f, 169.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.2f, 1.58f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -115.22f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12.78f, 9.62f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140.78f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196.81f, 169.61f)
                close()
            }
        }.build()

        return _AmazonLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _AmazonLogoFill: ImageVector? = null
