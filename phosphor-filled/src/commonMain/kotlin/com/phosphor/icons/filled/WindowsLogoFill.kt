package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.WindowsLogoFill: ImageVector
    get() {
        if (_WindowsLogoFill != null) {
            return _WindowsLogoFill!!
        }
        _WindowsLogoFill = ImageVector.Builder(
            name = "Filled.WindowsLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(104f, 144f)
                verticalLineToRelative(51.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                arcToRelative(8.54f, 8.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.43f, -0.13f)
                lineToRelative(-64f, -11.64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 184f)
                lineTo(24f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                lineTo(96f, 136f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 144f)
                close()
                moveTo(101.13f, 54.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.56f, -1.73f)
                lineToRelative(-64f, 11.64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 72f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(96f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(104f, 60.36f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 101.13f, 54.22f)
                close()
                moveTo(208f, 136f)
                lineTo(128f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(57.45f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.57f, 7.88f)
                lineToRelative(80f, 14.54f)
                arcTo(7.61f, 7.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(216f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 136f)
                close()
                moveTo(213.13f, 33.86f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.56f, -1.73f)
                lineToRelative(-80f, 14.55f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 54.55f)
                lineTo(120f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(216f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.13f, 33.86f)
                close()
            }
        }.build()

        return _WindowsLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _WindowsLogoFill: ImageVector? = null
