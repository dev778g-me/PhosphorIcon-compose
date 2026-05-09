package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.PipeThin: ImageVector
    get() {
        if (_PipeThin != null) {
            return _PipeThin!!
        }
        _PipeThin = ImageVector.Builder(
            name = "Thin.PipeThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 168f)
                verticalLineTo(144f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                horizontalLineToRelative(24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 48f)
                horizontalLineTo(144f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 96f)
                verticalLineToRelative(24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                lineTo(192f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 48f)
                lineTo(200f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 120f)
                lineTo(176f, 120f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 112f)
                lineTo(168f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 168f)
                lineTo(112f, 168f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 176f)
                lineTo(120f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 200f)
                lineTo(48f, 200f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                lineTo(40f, 176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 168f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 200f)
                lineTo(112f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 200f)
                lineTo(48f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 48f)
                lineTo(200f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 112f)
                lineTo(200f, 112f)
            }
        }.build()

        return _PipeThin!!
    }

@Suppress("ObjectPropertyName")
private var _PipeThin: ImageVector? = null
