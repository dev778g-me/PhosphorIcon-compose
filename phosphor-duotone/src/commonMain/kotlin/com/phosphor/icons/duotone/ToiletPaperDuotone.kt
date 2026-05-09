package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ToiletPaperDuotone: ImageVector
    get() {
        if (_ToiletPaperDuotone != null) {
            return _ToiletPaperDuotone!!
        }
        _ToiletPaperDuotone = ImageVector.Builder(
            name = "Duotone.ToiletPaperDuotone",
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
                moveTo(24f, 120f)
                arcToRelative(40f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 80f, 0f)
                arcToRelative(40f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -80f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(64f, 120f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 120f)
                arcToRelative(40f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 80f, 0f)
                arcToRelative(40f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -80f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 120f)
                verticalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(120f)
                curveToRelative(0f, -44.18f, -17.91f, -80f, -40f, -80f)
                horizontalLineTo(64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 120f)
                lineTo(128f, 120f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 120f)
                lineTo(176f, 120f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 120f)
                lineTo(232f, 120f)
            }
        }.build()

        return _ToiletPaperDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ToiletPaperDuotone: ImageVector? = null
