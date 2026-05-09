package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.BugBeetleThin: ImageVector
    get() {
        if (_BugBeetleThin != null) {
            return _BugBeetleThin!!
        }
        _BugBeetleThin = ImageVector.Builder(
            name = "Thin.BugBeetleThin",
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
                moveTo(128f, 40f)
                lineTo(128f, 40f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 112f)
                lineTo(200f, 160f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 232f)
                lineTo(128f, 232f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 160f)
                lineTo(56f, 112f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 144f)
                lineTo(224f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 144f)
                lineTo(56f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 176f)
                lineTo(57.78f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 112f)
                lineTo(224f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 144f)
                lineTo(128f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(198.22f, 176f)
                lineTo(224f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 32f)
                lineTo(174.75f, 57.25f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 32f)
                lineTo(81.25f, 57.25f)
            }
        }.build()

        return _BugBeetleThin!!
    }

@Suppress("ObjectPropertyName")
private var _BugBeetleThin: ImageVector? = null
