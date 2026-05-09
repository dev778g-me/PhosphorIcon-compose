package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CourtBasketballFill: ImageVector
    get() {
        if (_CourtBasketballFill != null) {
            return _CourtBasketballFill!!
        }
        _CourtBasketballFill = ImageVector.Builder(
            name = "Filled.CourtBasketballFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 92.23f)
                verticalLineToRelative(71.54f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.41f, 4f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -79.52f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 92.23f)
                close()
                moveTo(20.41f, 167.76f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -79.52f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.41f, 4f)
                verticalLineToRelative(71.54f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.41f, 167.76f)
                close()
                moveTo(116f, 48f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 64f)
                verticalLineToRelative(4.13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.8f, 4f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 111.74f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.8f, 4f)
                lineTo(16f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(84f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(120f, 52f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 116f, 48f)
                close()
                moveTo(224f, 48f)
                lineTo(140f, 48f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                lineTo(136f, 204f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(84f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineToRelative(-4.13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.8f, -4f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -111.74f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.8f, -4f)
                lineTo(240f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 48f)
                close()
            }
        }.build()

        return _CourtBasketballFill!!
    }

@Suppress("ObjectPropertyName")
private var _CourtBasketballFill: ImageVector? = null
