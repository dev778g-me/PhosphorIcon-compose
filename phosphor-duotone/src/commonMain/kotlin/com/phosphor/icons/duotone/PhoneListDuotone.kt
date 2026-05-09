package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PhoneListDuotone: ImageVector
    get() {
        if (_PhoneListDuotone != null) {
            return _PhoneListDuotone!!
        }
        _PhoneListDuotone = ImageVector.Builder(
            name = "Duotone.PhoneListDuotone",
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
                moveTo(156.39f, 153.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.59f, -0.69f)
                lineToRelative(47.16f, 21.13f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 8.3f)
                arcTo(48.33f, 48.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 224f)
                arcTo(136f, 136f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 88f)
                arcTo(48.33f, 48.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.92f, 40.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.3f, 4.8f)
                lineToRelative(21.13f, 47.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.66f, 7.53f)
                lineTo(81.32f, 125f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, 7.81f)
                curveToRelative(8.27f, 16.93f, 25.77f, 34.22f, 42.75f, 42.41f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.83f, -0.59f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156.39f, 153.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.59f, -0.69f)
                lineToRelative(47.16f, 21.13f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 8.3f)
                arcTo(48.33f, 48.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 224f)
                arcTo(136f, 136f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 88f)
                arcTo(48.33f, 48.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.92f, 40.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.3f, 4.8f)
                lineToRelative(21.13f, 47.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.66f, 7.53f)
                lineTo(81.32f, 125f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, 7.81f)
                curveToRelative(8.27f, 16.93f, 25.77f, 34.22f, 42.75f, 42.41f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.83f, -0.59f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 64f)
                lineTo(208f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 104f)
                lineTo(208f, 104f)
            }
        }.build()

        return _PhoneListDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneListDuotone: ImageVector? = null
