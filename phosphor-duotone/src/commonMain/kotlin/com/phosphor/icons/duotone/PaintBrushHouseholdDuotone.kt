package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PaintBrushHouseholdDuotone: ImageVector
    get() {
        if (_PaintBrushHouseholdDuotone != null) {
            return _PaintBrushHouseholdDuotone!!
        }
        _PaintBrushHouseholdDuotone = ImageVector.Builder(
            name = "Duotone.PaintBrushHouseholdDuotone",
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
                moveTo(225f, 31f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 191f, 31f)
                lineToRelative(-59f, 69f)
                lineTo(115.31f, 83.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 0f)
                lineTo(72f, 104f)
                lineToRelative(80f, 80f)
                lineToRelative(20.69f, -20.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.62f)
                lineTo(156f, 124f)
                lineToRelative(69f, -59f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 225f, 31f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 104f)
                lineTo(152f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(44f, 188f)
                lineTo(72f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(68f, 212f)
                lineTo(96f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 124f)
                lineToRelative(16.69f, 16.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22.62f)
                lineTo(96f, 240f)
                lineTo(16f, 160f)
                lineTo(92.69f, 83.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 0f)
                lineTo(132f, 100f)
                lineToRelative(59f, -69f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 225f, 65f)
                close()
            }
        }.build()

        return _PaintBrushHouseholdDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushHouseholdDuotone: ImageVector? = null
