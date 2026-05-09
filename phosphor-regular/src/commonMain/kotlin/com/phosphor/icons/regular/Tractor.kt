package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Tractor: ImageVector
    get() {
        if (_Tractor != null) {
            return _Tractor!!
        }
        _Tractor = ImageVector.Builder(
            name = "Regular.Tractor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(212f, 188f)
                moveToRelative(-28f, 0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, 0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -56f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(68f, 172f)
                moveToRelative(-44f, 0f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 88f, 0f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -88f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(68f, 172f)
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
                moveTo(232f, 168f)
                verticalLineTo(134f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.7f, -7.66f)
                lineTo(144f, 104f)
                verticalLineTo(48f)
                horizontalLineTo(56f)
                verticalLineTo(96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 48f)
                lineTo(56f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 48f)
                lineTo(160f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 96f)
                horizontalLineTo(68f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 76f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(40.28f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 104f)
                lineTo(144f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 114.83f)
                lineTo(184f, 72f)
            }
        }.build()

        return _Tractor!!
    }

@Suppress("ObjectPropertyName")
private var _Tractor: ImageVector? = null
