package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.GlobeSimpleThin: ImageVector
    get() {
        if (_GlobeSimpleThin != null) {
            return _GlobeSimpleThin!!
        }
        _GlobeSimpleThin = ImageVector.Builder(
            name = "Thin.GlobeSimpleThin",
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
                moveTo(32f, 128f)
                lineTo(224f, 128f)
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
                moveTo(168f, 128f)
                curveToRelative(0f, 64f, -40f, 96f, -40f, 96f)
                reflectiveCurveToRelative(-40f, -32f, -40f, -96f)
                reflectiveCurveToRelative(40f, -96f, 40f, -96f)
                reflectiveCurveTo(168f, 64f, 168f, 128f)
                close()
            }
        }.build()

        return _GlobeSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeSimpleThin: ImageVector? = null
