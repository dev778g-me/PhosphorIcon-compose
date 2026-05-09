package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CassetteTapeBold: ImageVector
    get() {
        if (_CassetteTapeBold != null) {
            return _CassetteTapeBold!!
        }
        _CassetteTapeBold = ImageVector.Builder(
            name = "Bold.CassetteTapeBold",
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
                moveTo(32f, 56f)
                lineTo(224f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 64f)
                lineTo(232f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 200f)
                lineTo(32f, 200f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 192f)
                lineTo(24f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 56f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(64f, 200f)
                lineToRelative(21.6f, -28.8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 168f)
                horizontalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.4f, 3.2f)
                lineTo(192f, 200f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(174f, 118f)
                moveToRelative(-22f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, 44f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(82f, 118f)
                moveToRelative(-22f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, 44f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(82f, 96f)
                lineTo(174f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(174f, 140f)
                lineTo(82f, 140f)
            }
        }.build()

        return _CassetteTapeBold!!
    }

@Suppress("ObjectPropertyName")
private var _CassetteTapeBold: ImageVector? = null
