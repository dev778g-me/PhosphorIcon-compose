package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.PlugsConnectedThin: ImageVector
    get() {
        if (_PlugsConnectedThin != null) {
            return _PlugsConnectedThin!!
        }
        _PlugsConnectedThin = ImageVector.Builder(
            name = "Thin.PlugsConnectedThin",
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
                moveTo(71.03f, 128.97f)
                lineTo(128.97f, 71.03f)
                arcTo(24f, 24f, 57.69f, isMoreThanHalf = false, isPositiveArc = true, 162.91f, 71.03f)
                lineTo(184.97f, 93.09f)
                arcTo(24f, 24f, 57.69f, isMoreThanHalf = false, isPositiveArc = true, 184.97f, 127.03f)
                lineTo(127.03f, 184.97f)
                arcTo(24f, 24f, 54.32f, isMoreThanHalf = false, isPositiveArc = true, 93.09f, 184.97f)
                lineTo(71.03f, 162.91f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71.03f, 128.97f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 88f)
                lineTo(168f, 168f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 24f)
                lineTo(173.94f, 82.06f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(82.06f, 173.94f)
                lineTo(24f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 32f)
                lineTo(104f, 52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 96f)
                lineTo(52f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(204f, 152f)
                lineTo(224f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 204f)
                lineTo(160f, 224f)
            }
        }.build()

        return _PlugsConnectedThin!!
    }

@Suppress("ObjectPropertyName")
private var _PlugsConnectedThin: ImageVector? = null
