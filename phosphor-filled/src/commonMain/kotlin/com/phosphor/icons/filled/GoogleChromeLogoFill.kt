package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GoogleChromeLogoFill: ImageVector
    get() {
        if (_GoogleChromeLogoFill != null) {
            return _GoogleChromeLogoFill!!
        }
        _GoogleChromeLogoFill = ImageVector.Builder(
            name = "Filled.GoogleChromeLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(128f, 40f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.72f, 40f)
                lineTo(128f, 80f)
                arcToRelative(48.08f, 48.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.6f, 33f)
                lineToRelative(-23.08f, -40f)
                arcTo(87.89f, 87.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40f)
                close()
                moveTo(40f, 128f)
                arcToRelative(87.44f, 87.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.56f, -39.86f)
                lineTo(86.43f, 152f)
                curveToRelative(0.06f, 0.1f, 0.13f, 0.19f, 0.19f, 0.28f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 137.82f, 175f)
                lineToRelative(-23.1f, 40f)
                arcTo(88.14f, 88.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 128f)
                close()
                moveTo(132.69f, 215.87f)
                lineTo(169.57f, 152f)
                curveToRelative(0.08f, -0.14f, 0.14f, -0.28f, 0.22f, -0.42f)
                arcToRelative(47.88f, 47.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -55.58f)
                lineTo(210f, 96f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -77.29f, 119.87f)
                close()
            }
        }.build()

        return _GoogleChromeLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleChromeLogoFill: ImageVector? = null
