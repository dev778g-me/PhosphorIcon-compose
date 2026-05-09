package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.TextHFiveThin: ImageVector
    get() {
        if (_TextHFiveThin != null) {
            return _TextHFiveThin!!
        }
        _TextHFiveThin = ImageVector.Builder(
            name = "Thin.TextHFiveThin",
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
                moveTo(240f, 112f)
                horizontalLineTo(200f)
                lineToRelative(-8f, 48f)
                arcToRelative(27.57f, 27.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, -8f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 56f)
                arcToRelative(27.57f, 27.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, -8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 56f)
                lineTo(40f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 116f)
                lineTo(40f, 116f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 56f)
                lineTo(144f, 176f)
            }
        }.build()

        return _TextHFiveThin!!
    }

@Suppress("ObjectPropertyName")
private var _TextHFiveThin: ImageVector? = null
