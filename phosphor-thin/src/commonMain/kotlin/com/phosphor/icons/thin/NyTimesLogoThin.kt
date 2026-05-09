package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.NyTimesLogoThin: ImageVector
    get() {
        if (_NyTimesLogoThin != null) {
            return _NyTimesLogoThin!!
        }
        _NyTimesLogoThin = ImageVector.Builder(
            name = "Thin.NyTimesLogoThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(172f, 148f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 129.07f)
                lineTo(96f, 217.34f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48.66f, 154.31f)
                lineToRelative(79.34f, -42.31f)
                lineToRelative(0f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(204.34f, 168f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120.23f, 64.37f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64.19f, 95.74f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 40f)
                lineTo(188f, 96f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -56f)
            }
        }.build()

        return _NyTimesLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _NyTimesLogoThin: ImageVector? = null
