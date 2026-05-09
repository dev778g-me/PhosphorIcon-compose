package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ChatCircleSlashDuotone: ImageVector
    get() {
        if (_ChatCircleSlashDuotone != null) {
            return _ChatCircleSlashDuotone!!
        }
        _ChatCircleSlashDuotone = ImageVector.Builder(
            name = "Duotone.ChatCircleSlashDuotone",
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
                moveTo(79.93f, 211.11f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -35f, -35f)
                horizontalLineToRelative(0f)
                lineTo(32.42f, 213.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.12f, 10.12f)
                lineToRelative(37.39f, -12.47f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(212.57f, 173.46f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -121.79f, -134f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(63.42f, 57f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.53f, 119.1f)
                horizontalLineToRelative(0f)
                lineTo(32.42f, 213.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.12f, 10.12f)
                lineToRelative(37.39f, -12.47f)
                horizontalLineToRelative(0f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192.58f, 199f)
            }
        }.build()

        return _ChatCircleSlashDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ChatCircleSlashDuotone: ImageVector? = null
