package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChartPolarFill: ImageVector
    get() {
        if (_ChartPolarFill != null) {
            return _ChartPolarFill!!
        }
        _ChartPolarFill = ImageVector.Builder(
            name = "Filled.ChartPolarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 199.54f)
                verticalLineToRelative(27.74f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.46f, 4f)
                arcToRelative(104.22f, 104.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -90.8f, -90.8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4.46f)
                lineTo(56.46f, 136.02f)
                arcTo(72.11f, 72.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 199.54f)
                close()
                moveTo(183.42f, 136f)
                lineTo(136f, 136f)
                verticalLineToRelative(47.42f)
                arcTo(56.11f, 56.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 183.42f, 136f)
                close()
                moveTo(136f, 72.58f)
                lineTo(136f, 120f)
                horizontalLineToRelative(47.42f)
                arcTo(56.11f, 56.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 72.58f)
                close()
                moveTo(227.28f, 136f)
                lineTo(199.54f, 136f)
                arcTo(72.11f, 72.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 199.54f)
                verticalLineToRelative(27.74f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.46f, 4f)
                arcToRelative(104.22f, 104.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.8f, -90.8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.28f, 136f)
                close()
                moveTo(199.54f, 120f)
                horizontalLineToRelative(27.74f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4.46f)
                arcToRelative(104.22f, 104.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -90.8f, -90.8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.46f, 4f)
                lineTo(136.02f, 56.46f)
                arcTo(72.11f, 72.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 199.54f, 120f)
                close()
                moveTo(115.54f, 24.74f)
                arcToRelative(104.22f, 104.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -90.8f, 90.8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.46f)
                lineTo(56.46f, 120f)
                arcTo(72.11f, 72.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 56.46f)
                lineTo(120f, 28.72f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 115.54f, 24.74f)
                close()
                moveTo(72.58f, 120f)
                lineTo(120f, 120f)
                lineTo(120f, 72.58f)
                arcTo(56.11f, 56.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.58f, 120f)
                close()
                moveTo(120f, 183.42f)
                lineTo(120f, 136f)
                lineTo(72.58f, 136f)
                arcTo(56.11f, 56.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 183.42f)
                close()
            }
        }.build()

        return _ChartPolarFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPolarFill: ImageVector? = null
