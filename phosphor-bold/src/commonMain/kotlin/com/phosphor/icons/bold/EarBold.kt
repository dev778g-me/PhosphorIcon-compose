package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.EarBold: ImageVector
    get() {
        if (_EarBold != null) {
            return _EarBold!!
        }
        _EarBold = ImageVector.Builder(
            name = "Bold.EarBold",
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
                moveTo(160f, 216f)
                curveToRelative(-8.07f, 9.77f, -18.34f, 16f, -32f, 16f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -44f, -44f)
                curveToRelative(0f, -41.49f, -36f, -28f, -36f, -84f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(173.86f, 168f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 160f)
                curveToRelative(0f, -24f, 24f, -32f, 24f, -56f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 0f)
            }
        }.build()

        return _EarBold!!
    }

@Suppress("ObjectPropertyName")
private var _EarBold: ImageVector? = null
