package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.OpenAiLogoBold: ImageVector
    get() {
        if (_OpenAiLogoBold != null) {
            return _OpenAiLogoBold!!
        }
        _OpenAiLogoBold = ImageVector.Builder(
            name = "Bold.OpenAiLogoBold",
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
                moveTo(108f, 139.55f)
                verticalLineTo(74.88f)
                lineTo(148.5f, 51.5f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.4f, 64.08f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 151.09f)
                lineTo(72f, 118.76f)
                verticalLineTo(72f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.69f, -25.47f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 139.55f)
                lineTo(92f, 171.88f)
                lineTo(51.5f, 148.5f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.79f, 59f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 116.45f)
                verticalLineToRelative(64.67f)
                lineTo(107.5f, 204.5f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -66.4f, -64.08f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104.91f)
                lineToRelative(56f, 32.33f)
                verticalLineTo(184f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -88.69f, 25.47f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 116.45f)
                lineToRelative(56f, -32.33f)
                lineToRelative(40.5f, 23.38f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.29f, 89.55f)
            }
        }.build()

        return _OpenAiLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _OpenAiLogoBold: ImageVector? = null
