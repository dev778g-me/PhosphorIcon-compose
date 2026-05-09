package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.OpenAiLogo: ImageVector
    get() {
        if (_OpenAiLogo != null) {
            return _OpenAiLogo!!
        }
        _OpenAiLogo = ImageVector.Builder(
            name = "Regular.OpenAiLogo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 141.86f)
                verticalLineTo(77.19f)
                lineTo(148.5f, 51.5f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.4f, 64.08f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 155.71f)
                lineTo(72f, 123.38f)
                verticalLineTo(72f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.69f, -25.47f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 141.86f)
                lineTo(96f, 174.19f)
                lineTo(51.5f, 148.5f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.79f, 59f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 114.14f)
                verticalLineToRelative(64.67f)
                lineTo(107.5f, 204.5f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -66.4f, -64.08f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 100.29f)
                lineToRelative(56f, 32.33f)
                verticalLineTo(184f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -88.69f, 25.47f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 114.14f)
                lineToRelative(56f, -32.33f)
                lineToRelative(44.5f, 25.69f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.29f, 89.55f)
            }
        }.build()

        return _OpenAiLogo!!
    }

@Suppress("ObjectPropertyName")
private var _OpenAiLogo: ImageVector? = null
