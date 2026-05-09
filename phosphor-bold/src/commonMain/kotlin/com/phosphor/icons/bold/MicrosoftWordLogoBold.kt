package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MicrosoftWordLogoBold: ImageVector
    get() {
        if (_MicrosoftWordLogoBold != null) {
            return _MicrosoftWordLogoBold!!
        }
        _MicrosoftWordLogoBold = ImageVector.Builder(
            name = "Bold.MicrosoftWordLogoBold",
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
                moveTo(156f, 96f)
                lineTo(208f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 160f)
                lineTo(208f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 68f)
                verticalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(188f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 104f)
                lineToRelative(12f, 48f)
                lineToRelative(16f, -32f)
                lineToRelative(16f, 32f)
                lineToRelative(12f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(36f, 68f)
                lineTo(148f, 68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 76f)
                lineTo(156f, 180f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 188f)
                lineTo(36f, 188f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 180f)
                lineTo(28f, 76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 68f)
                close()
            }
        }.build()

        return _MicrosoftWordLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftWordLogoBold: ImageVector? = null
