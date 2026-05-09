package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.SmileyMeltingBold: ImageVector
    get() {
        if (_SmileyMeltingBold != null) {
            return _SmileyMeltingBold!!
        }
        _SmileyMeltingBold = ImageVector.Builder(
            name = "Bold.SmileyMeltingBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(164f, 136f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 92f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56.44f, 192f)
                arcTo(95.67f, 95.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 126.06f)
                curveTo(33f, 74.58f, 75.15f, 32.73f, 126.63f, 32f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72.93f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 236f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, -20f)
                horizontalLineToRelative(40f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -40f)
                horizontalLineToRelative(-4f)
                curveToRelative(-26.51f, 0f, -56f, -21.49f, -56f, -48f)
                arcToRelative(49f, 49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, -8f)
            }
        }.build()

        return _SmileyMeltingBold!!
    }

@Suppress("ObjectPropertyName")
private var _SmileyMeltingBold: ImageVector? = null
