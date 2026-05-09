package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PentagramDuotone: ImageVector
    get() {
        if (_PentagramDuotone != null) {
            return _PentagramDuotone!!
        }
        _PentagramDuotone = ImageVector.Builder(
            name = "Duotone.PentagramDuotone",
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
                moveTo(224f, 88f)
                horizontalLineTo(157.13f)
                lineTo(135.61f, 21.68f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.22f, 0f)
                lineTo(98.87f, 88f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.71f, 14.47f)
                lineToRelative(54.21f, 39f)
                lineToRelative(-20.77f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.31f, 8.95f)
                lineTo(128f, 174.91f)
                lineToRelative(54.94f, 39.53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.31f, -8.95f)
                lineToRelative(-20.77f, -64f)
                lineToRelative(54.21f, -39f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 88f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60.75f, 205.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.31f, 8.95f)
                lineToRelative(155.63f, -112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 88f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.71f, 14.47f)
                lineToRelative(155.63f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.31f, -8.95f)
                lineTo(135.61f, 21.68f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.22f, 0f)
                close()
            }
        }.build()

        return _PentagramDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PentagramDuotone: ImageVector? = null
