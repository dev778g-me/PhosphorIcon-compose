package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.YarnThin: ImageVector
    get() {
        if (_YarnThin != null) {
            return _YarnThin!!
        }
        _YarnThin = ImageVector.Builder(
            name = "Thin.YarnThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 224f)
                lineTo(232f, 223.97f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92.3f, 217.14f)
                arcTo(176.3f, 176.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 214.81f, 87f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(57.34f, 193f)
                arcTo(216.52f, 216.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188.59f, 53.53f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(131.8f, 223.93f)
                arcTo(136.3f, 136.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 126f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32.31f, 120.25f)
                arcToRelative(135.07f, 135.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53f, 14.33f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(44.19f, 81.15f)
                arcToRelative(175f, 175f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.17f, 22f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(77.12f, 46.58f)
                arcTo(215f, 215f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 76.37f)
            }
        }.build()

        return _YarnThin!!
    }

@Suppress("ObjectPropertyName")
private var _YarnThin: ImageVector? = null
