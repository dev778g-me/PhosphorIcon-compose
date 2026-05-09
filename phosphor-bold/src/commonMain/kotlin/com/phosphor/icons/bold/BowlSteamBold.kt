package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BowlSteamBold: ImageVector
    get() {
        if (_BowlSteamBold != null) {
            return _BowlSteamBold!!
        }
        _BowlSteamBold = ImageVector.Builder(
            name = "Bold.BowlSteamBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 207.3f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 120f)
                horizontalLineTo(224f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 87.3f)
                verticalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(172f, 84f)
                reflectiveCurveToRelative(-18f, -5.2f, 0f, -26f)
                reflectiveCurveToRelative(0f, -26f, 0f, -26f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 84f)
                reflectiveCurveToRelative(-18f, -5.2f, 0f, -26f)
                reflectiveCurveToRelative(0f, -26f, 0f, -26f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(84f, 84f)
                reflectiveCurveToRelative(-18f, -5.2f, 0f, -26f)
                reflectiveCurveToRelative(0f, -26f, 0f, -26f)
            }
        }.build()

        return _BowlSteamBold!!
    }

@Suppress("ObjectPropertyName")
private var _BowlSteamBold: ImageVector? = null
