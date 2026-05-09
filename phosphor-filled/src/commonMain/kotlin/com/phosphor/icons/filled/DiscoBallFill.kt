package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DiscoBallFill: ImageVector
    get() {
        if (_DiscoBallFill != null) {
            return _DiscoBallFill!!
        }
        _DiscoBallFill = ImageVector.Builder(
            name = "Filled.DiscoBallFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 64.37f)
                lineTo(120f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(104f, 64.37f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(183.54f, 144f)
                lineTo(151.77f, 144f)
                curveToRelative(-1.51f, -28.36f, -10.79f, -48.36f, -19.44f, -61.06f)
                arcTo(72.16f, 72.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 183.54f, 144f)
                close()
                moveTo(135.76f, 160f)
                curveToRelative(-2f, 33.52f, -16.13f, 52.95f, -23.76f, 61.08f)
                curveToRelative(-7.64f, -8.15f, -21.77f, -27.57f, -23.76f, -61.08f)
                close()
                moveTo(91.67f, 82.94f)
                curveTo(83f, 95.64f, 73.74f, 115.64f, 72.23f, 144f)
                lineTo(40.46f, 144f)
                arcTo(72.16f, 72.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 91.67f, 82.94f)
                close()
                moveTo(40.46f, 160f)
                lineTo(72.23f, 160f)
                curveToRelative(1.51f, 28.36f, 10.79f, 48.36f, 19.44f, 61.06f)
                arcTo(72.16f, 72.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.46f, 160f)
                close()
                moveTo(256f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(224f, 96f)
                horizontalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(8f)
                lineTo(224f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 88f)
                close()
                moveTo(152f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(16f)
                lineTo(176f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(192f, 32f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(192f, 48f)
                lineTo(192f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(176f, 48f)
                lineTo(160f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 40f)
                close()
            }
        }.build()

        return _DiscoBallFill!!
    }

@Suppress("ObjectPropertyName")
private var _DiscoBallFill: ImageVector? = null
