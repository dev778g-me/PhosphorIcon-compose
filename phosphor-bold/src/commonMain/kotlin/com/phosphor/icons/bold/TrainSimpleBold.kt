package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.TrainSimpleBold: ImageVector
    get() {
        if (_TrainSimpleBold != null) {
            return _TrainSimpleBold!!
        }
        _TrainSimpleBold = ImageVector.Builder(
            name = "Bold.TrainSimpleBold",
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
                moveTo(96f, 208f)
                lineTo(72f, 240f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 208f)
                lineTo(184f, 240f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 128f)
                lineTo(208f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 32f)
                lineTo(184f, 32f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 56f)
                lineTo(208f, 184f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 208f)
                lineTo(72f, 208f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 184f)
                lineTo(48f, 56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 168f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 168f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
        }.build()

        return _TrainSimpleBold!!
    }

@Suppress("ObjectPropertyName")
private var _TrainSimpleBold: ImageVector? = null
