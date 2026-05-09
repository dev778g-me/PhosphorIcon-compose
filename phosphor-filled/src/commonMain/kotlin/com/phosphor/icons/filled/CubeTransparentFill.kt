package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CubeTransparentFill: ImageVector
    get() {
        if (_CubeTransparentFill != null) {
            return _CubeTransparentFill!!
        }
        _CubeTransparentFill = ImageVector.Builder(
            name = "Filled.CubeTransparentFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(104f, 152f)
                lineTo(104f, 104f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(48f)
                close()
                moveTo(32f, 53f)
                verticalLineToRelative(95f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(88f, 152f)
                lineTo(88f, 99.31f)
                lineTo(38.83f, 50.14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 53f)
                close()
                moveTo(220f, 104f)
                lineTo(168f, 104f)
                verticalLineToRelative(52.69f)
                lineToRelative(49.17f, 49.17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 203f)
                lineTo(224f, 108f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 220f, 104f)
                close()
                moveTo(152f, 36f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(53f, 32f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 6.83f)
                lineTo(99.31f, 88f)
                lineTo(152f, 88f)
                close()
                moveTo(212.49f, 81.17f)
                lineTo(174.83f, 43.51f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 46.34f)
                lineTo(168f, 88f)
                horizontalLineToRelative(41.66f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212.49f, 81.17f)
                close()
                moveTo(156.69f, 168f)
                lineTo(104f, 168f)
                verticalLineToRelative(52f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(95f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, -6.83f)
                close()
                moveTo(43.51f, 174.83f)
                lineToRelative(37.66f, 37.66f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 209.66f)
                lineTo(88f, 168f)
                lineTo(46.34f, 168f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 43.51f, 174.83f)
                close()
            }
        }.build()

        return _CubeTransparentFill!!
    }

@Suppress("ObjectPropertyName")
private var _CubeTransparentFill: ImageVector? = null
