package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BaseballBold: ImageVector
    get() {
        if (_BaseballBold != null) {
            return _BaseballBold!!
        }
        _BaseballBold = ImageVector.Builder(
            name = "Bold.BaseballBold",
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
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60f, 60.24f)
                arcTo(96.45f, 96.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 75.16f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(75.16f, 176f)
                arcTo(96.45f, 96.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 195.76f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196f, 60.24f)
                arcTo(96.45f, 96.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 180.84f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180.84f, 176f)
                arcTo(96.45f, 96.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196f, 195.76f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(87.26f, 116f)
                arcTo(97f, 97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 128f)
                arcToRelative(97f, 97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.74f, 12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168.74f, 116f)
                arcToRelative(97.67f, 97.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24f)
            }
        }.build()

        return _BaseballBold!!
    }

@Suppress("ObjectPropertyName")
private var _BaseballBold: ImageVector? = null
