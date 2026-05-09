package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.MicrophoneSlashDuotone: ImageVector
    get() {
        if (_MicrophoneSlashDuotone != null) {
            return _MicrophoneSlashDuotone!!
        }
        _MicrophoneSlashDuotone = ImageVector.Builder(
            name = "Duotone.MicrophoneSlashDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(128f, 24f)
                lineTo(128f, 24f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 64f)
                lineTo(168f, 128f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                lineTo(128f, 168f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 128f)
                lineTo(88f, 64f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 200f)
                lineTo(128f, 240f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 48f)
                lineTo(208f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(172.32f, 184.75f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 128f)
                arcToRelative(71.7f, 71.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.29f, 31.61f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
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
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(91.3f, 48.06f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 24f)
                horizontalLineToRelative(0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                verticalLineToRelative(64f)
                arcToRelative(38.66f, 38.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.22f, 4.19f)
            }
        }.build()

        return _MicrophoneSlashDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSlashDuotone: ImageVector? = null
