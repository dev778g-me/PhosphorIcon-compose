package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ShoppingCartSimpleBold: ImageVector
    get() {
        if (_ShoppingCartSimpleBold != null) {
            return _ShoppingCartSimpleBold!!
        }
        _ShoppingCartSimpleBold = ImageVector.Builder(
            name = "Bold.ShoppingCartSimpleBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 32f)
                horizontalLineTo(40f)
                lineTo(76.75f, 164.28f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.16f, 176f)
                horizontalLineTo(191f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.42f, -11.72f)
                lineTo(232f, 72f)
                horizontalLineTo(51.11f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 220f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 220f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
        }.build()

        return _ShoppingCartSimpleBold!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCartSimpleBold: ImageVector? = null
