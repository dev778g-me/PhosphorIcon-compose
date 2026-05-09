package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MicrosoftOutlookLogoBold: ImageVector
    get() {
        if (_MicrosoftOutlookLogoBold != null) {
            return _MicrosoftOutlookLogoBold!!
        }
        _MicrosoftOutlookLogoBold = ImageVector.Builder(
            name = "Bold.MicrosoftOutlookLogoBold",
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
                moveTo(36f, 68f)
                lineTo(140f, 68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 76f)
                lineTo(148f, 180f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 188f)
                lineTo(36f, 188f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 180f)
                lineTo(28f, 76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 68f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 128f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 112f)
                horizontalLineToRelative(24f)
                verticalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(188f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(221.35f, 221.94f)
                lineTo(148f, 164.89f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 112f)
                lineTo(152f, 168f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 68f)
                lineToRelative(0f, -36f)
                lineToRelative(96f, 0f)
                lineToRelative(0f, 98.67f)
            }
        }.build()

        return _MicrosoftOutlookLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftOutlookLogoBold: ImageVector? = null
