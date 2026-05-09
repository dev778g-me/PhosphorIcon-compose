package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CirclesThreePlusBold: ImageVector
    get() {
        if (_CirclesThreePlusBold != null) {
            return _CirclesThreePlusBold!!
        }
        _CirclesThreePlusBold = ImageVector.Builder(
            name = "Bold.CirclesThreePlusBold",
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
                moveTo(78f, 78f)
                moveToRelative(-30f, 0f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60f, 0f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, -60f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(178f, 78f)
                moveToRelative(-30f, 0f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60f, 0f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, -60f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(78f, 178f)
                moveToRelative(-30f, 0f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60f, 0f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = true, -60f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(178f, 148f)
                lineTo(178f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 178f)
                lineTo(148f, 178f)
            }
        }.build()

        return _CirclesThreePlusBold!!
    }

@Suppress("ObjectPropertyName")
private var _CirclesThreePlusBold: ImageVector? = null
