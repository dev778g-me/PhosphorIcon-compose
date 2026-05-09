package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.KnifeThin: ImageVector
    get() {
        if (_KnifeThin != null) {
            return _KnifeThin!!
        }
        _KnifeThin = ImageVector.Builder(
            name = "Thin.KnifeThin",
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
                moveTo(146f, 90f)
                lineToRelative(54f, 54f)
                reflectiveCurveToRelative(-72f, 92f, -176f, 68f)
                lineTo(198.2f, 37.8f)
                arcToRelative(19.8f, 19.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(19.8f, 19.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 28f)
                lineTo(174f, 118f)
            }
        }.build()

        return _KnifeThin!!
    }

@Suppress("ObjectPropertyName")
private var _KnifeThin: ImageVector? = null
