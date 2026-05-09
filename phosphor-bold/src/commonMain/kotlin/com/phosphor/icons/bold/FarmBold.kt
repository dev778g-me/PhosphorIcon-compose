package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FarmBold: ImageVector
    get() {
        if (_FarmBold != null) {
            return _FarmBold!!
        }
        _FarmBold = ImageVector.Builder(
            name = "Bold.FarmBold",
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
                moveTo(128f, 142f)
                arcToRelative(255f, 255f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, -22f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 120f)
                arcToRelative(255.5f, 255.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 199.85f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 126.14f)
                lineToRelative(0f, -46.14f)
                lineToRelative(64f, -48f)
                lineToRelative(64f, 48f)
                lineToRelative(0f, 41.11f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 138.61f)
                lineToRelative(0f, -42.61f)
                lineToRelative(48f, 0f)
                lineToRelative(0f, 32.06f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 160f)
                arcToRelative(215.21f, 215.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 145.11f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 200f)
                arcToRelative(175.33f, 175.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.42f, 16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(173.35f, 168.06f)
                arcTo(216.14f, 216.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 160f)
            }
        }.build()

        return _FarmBold!!
    }

@Suppress("ObjectPropertyName")
private var _FarmBold: ImageVector? = null
