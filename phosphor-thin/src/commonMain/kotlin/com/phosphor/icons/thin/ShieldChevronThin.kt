package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ShieldChevronThin: ImageVector
    get() {
        if (_ShieldChevronThin != null) {
            return _ShieldChevronThin!!
        }
        _ShieldChevronThin = ImageVector.Builder(
            name = "Thin.ShieldChevronThin",
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
                moveTo(216f, 112f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 96f, 88f, 120f, 88f, 120f)
                reflectiveCurveTo(216f, 208f, 216f, 112f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(201.97f, 171.78f)
                lineToRelative(-73.97f, -51.78f)
                lineToRelative(-73.97f, 51.78f)
            }
        }.build()

        return _ShieldChevronThin!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldChevronThin: ImageVector? = null
