package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.GooglePlayLogoDuotone: ImageVector
    get() {
        if (_GooglePlayLogoDuotone != null) {
            return _GooglePlayLogoDuotone!!
        }
        _GooglePlayLogoDuotone = ImageVector.Builder(
            name = "Duotone.GooglePlayLogoDuotone",
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
                moveTo(160f, 128f)
                lineTo(58.32f, 26.32f)
                arcTo(7.7f, 7.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 31.86f)
                verticalLineTo(224.14f)
                arcToRelative(7.7f, 7.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.32f, 5.54f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 224.14f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.06f, 6.77f)
                lineTo(235.9f, 134.84f)
                arcToRelative(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.68f)
                lineTo(68.06f, 25.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 31.86f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(58.33f, 26.33f)
                lineTo(192f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(58.33f, 229.67f)
                lineTo(191.98f, 96.02f)
            }
        }.build()

        return _GooglePlayLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GooglePlayLogoDuotone: ImageVector? = null
