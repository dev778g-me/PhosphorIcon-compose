package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.StarHalfDuotone: ImageVector
    get() {
        if (_StarHalfDuotone != null) {
            return _StarHalfDuotone!!
        }
        _StarHalfDuotone = ImageVector.Builder(
            name = "Duotone.StarHalfDuotone",
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
                moveTo(120.26f, 29.2f)
                lineTo(95.64f, 88.8f)
                lineTo(31.73f, 94f)
                arcToRelative(8.46f, 8.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.79f, 14.83f)
                lineToRelative(48.7f, 42f)
                lineTo(60.76f, 213.57f)
                arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.52f, 9.17f)
                lineTo(128f, 189.09f)
                verticalLineTo(24f)
                arcTo(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120.26f, 29.2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 189.09f)
                lineTo(128f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 189.09f)
                lineToRelative(54.72f, 33.65f)
                arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.52f, -9.17f)
                lineToRelative(-14.88f, -62.79f)
                lineToRelative(48.7f, -42f)
                arcTo(8.46f, 8.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224.27f, 94f)
                lineTo(160.36f, 88.8f)
                lineTo(135.74f, 29.2f)
                arcToRelative(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.48f, 0f)
                lineTo(95.64f, 88.8f)
                lineTo(31.73f, 94f)
                arcToRelative(8.46f, 8.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.79f, 14.83f)
                lineToRelative(48.7f, 42f)
                lineTo(60.76f, 213.57f)
                arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.52f, 9.17f)
                close()
            }
        }.build()

        return _StarHalfDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StarHalfDuotone: ImageVector? = null
