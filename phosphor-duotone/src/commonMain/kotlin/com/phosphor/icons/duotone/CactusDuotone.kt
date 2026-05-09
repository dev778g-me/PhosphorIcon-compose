package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CactusDuotone: ImageVector
    get() {
        if (_CactusDuotone != null) {
            return _CactusDuotone!!
        }
        _CactusDuotone = ImageVector.Builder(
            name = "Duotone.CactusDuotone",
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
                moveTo(96f, 216f)
                verticalLineTo(136f)
                horizontalLineTo(84f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 76f)
                horizontalLineToRelative(0f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 56f)
                horizontalLineToRelative(0f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 76f)
                horizontalLineToRelative(0f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 96f)
                horizontalLineTo(96f)
                verticalLineTo(56f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                horizontalLineToRelative(0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(12f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, -20f)
                horizontalLineToRelative(0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, -20f)
                horizontalLineToRelative(0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineToRelative(0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = true, -60f, 60f)
                horizontalLineTo(160f)
                verticalLineToRelative(40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 216f)
                lineTo(216f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 216f)
                verticalLineTo(136f)
                horizontalLineTo(84f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 76f)
                horizontalLineToRelative(0f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 56f)
                horizontalLineToRelative(0f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 76f)
                horizontalLineToRelative(0f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 96f)
                horizontalLineTo(96f)
                verticalLineTo(56f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                horizontalLineToRelative(0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(12f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, -20f)
                horizontalLineToRelative(0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, -20f)
                horizontalLineToRelative(0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineToRelative(0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = true, -60f, 60f)
                horizontalLineTo(160f)
                verticalLineToRelative(40f)
            }
        }.build()

        return _CactusDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CactusDuotone: ImageVector? = null
