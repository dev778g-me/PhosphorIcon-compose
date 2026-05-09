package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.VideoCameraDuotone: ImageVector
    get() {
        if (_VideoCameraDuotone != null) {
            return _VideoCameraDuotone!!
        }
        _VideoCameraDuotone = ImageVector.Builder(
            name = "Duotone.VideoCameraDuotone",
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
                moveTo(32f, 64f)
                lineTo(192f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 72f)
                lineTo(200f, 184f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 192f)
                lineTo(32f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 184f)
                lineTo(24f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 64f)
                lineTo(192f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 72f)
                lineTo(200f, 184f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 192f)
                lineTo(32f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 184f)
                lineTo(24f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 112f)
                lineToRelative(48f, -32f)
                lineToRelative(0f, 96f)
                lineToRelative(-48f, -32f)
            }
        }.build()

        return _VideoCameraDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCameraDuotone: ImageVector? = null
