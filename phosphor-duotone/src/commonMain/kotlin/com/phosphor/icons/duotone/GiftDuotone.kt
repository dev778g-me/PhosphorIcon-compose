package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.GiftDuotone: ImageVector
    get() {
        if (_GiftDuotone != null) {
            return _GiftDuotone!!
        }
        _GiftDuotone = ImageVector.Builder(
            name = "Duotone.GiftDuotone",
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
                moveTo(208f, 128f)
                verticalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(128f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 80f)
                lineTo(216f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 88f)
                lineTo(224f, 120f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                lineTo(40f, 128f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 120f)
                lineTo(32f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 128f)
                verticalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 80f)
                lineTo(128f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176.79f, 31.21f)
                curveToRelative(9.34f, 9.34f, 9.89f, 25.06f, 0f, 33.82f)
                curveTo(159.88f, 80f, 128f, 80f, 128f, 80f)
                reflectiveCurveToRelative(0f, -31.88f, 15f, -48.79f)
                curveTo(151.73f, 21.32f, 167.45f, 21.87f, 176.79f, 31.21f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(79.21f, 31.21f)
                curveToRelative(-9.34f, 9.34f, -9.89f, 25.06f, 0f, 33.82f)
                curveTo(96.12f, 80f, 128f, 80f, 128f, 80f)
                reflectiveCurveToRelative(0f, -31.88f, -15f, -48.79f)
                curveTo(104.27f, 21.32f, 88.55f, 21.87f, 79.21f, 31.21f)
                close()
            }
        }.build()

        return _GiftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GiftDuotone: ImageVector? = null
