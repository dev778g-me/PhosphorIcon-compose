package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MicrophoneSlashBold: ImageVector
    get() {
        if (_MicrophoneSlashBold != null) {
            return _MicrophoneSlashBold!!
        }
        _MicrophoneSlashBold = ImageVector.Builder(
            name = "Bold.MicrophoneSlashBold",
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
                moveTo(48f, 48f)
                lineTo(208f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 208f)
                lineTo(128f, 240f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(177.71f, 190.68f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 128f)
                arcToRelative(79.86f, 79.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.85f, 30.1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(150.68f, 161f)
                arcTo(39.77f, 39.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                horizontalLineToRelative(0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
                verticalLineTo(92f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(95.46f, 40.74f)
                arcTo(39.93f, 39.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 24f)
                horizontalLineToRelative(0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                verticalLineToRelative(56.54f)
            }
        }.build()

        return _MicrophoneSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSlashBold: ImageVector? = null
