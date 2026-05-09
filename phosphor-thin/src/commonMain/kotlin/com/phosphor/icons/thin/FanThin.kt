package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.FanThin: ImageVector
    get() {
        if (_FanThin != null) {
            return _FanThin!!
        }
        _FanThin = ImageVector.Builder(
            name = "Thin.FanThin",
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
                moveTo(128f, 128f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104.31f, 124.14f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 47.69f, -92f)
                lineToRelative(-18.17f, 72.54f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136.5f, 150.45f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 33f, 155.13f)
                lineToRelative(71.91f, -20.54f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(143.19f, 109.41f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 199f, 196.7f)
                lineToRelative(-53.74f, -52f)
            }
        }.build()

        return _FanThin!!
    }

@Suppress("ObjectPropertyName")
private var _FanThin: ImageVector? = null
